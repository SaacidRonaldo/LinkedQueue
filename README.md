Name : Abdullahi Hussein Abdikariim
ID_Card : C1220172
Class_Name : CA221



@RestController
public class GreetingController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Spring Boot Application!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}



@RestController
public class ResponseController {

    @GetMapping("/success")
    public ResponseEntity<String> success() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "SuccessHeader");
        return ResponseEntity.ok().headers(headers).body("Request was successful!");
    }

    @GetMapping("/not-found")
    public ResponseEntity<String> notFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found");
    }

    @PostMapping("/create")
    public ResponseEntity<String> create() {
        URI location = URI.create("/resource/123");
        return ResponseEntity.created(location).body("Resource created at /resource/123");
    }
}




@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private Long id;
    private String name;
    private String position;
}





@Service
public class StaffService {
    private final Map<Long, Staff> staffMap = new HashMap<>();
    private long idCounter = 1;

    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffMap.values());
    }

    public Staff getStaffById(Long id) {
        return staffMap.get(id);
    }

    public Staff createStaff(Staff staff) {
        staff.setId(idCounter++);
        staffMap.put(staff.getId(), staff);
        return staff;
    }

    public Staff updateStaff(Long id, Staff updatedStaff) {
        if (staffMap.containsKey(id)) {
            updatedStaff.setId(id);
            staffMap.put(id, updatedStaff);
            return updatedStaff;
        }
        return null;
    }

    public boolean deleteStaff(Long id) {
        return staffMap.remove(id) != null;
    }
}








@RestController
@RequestMapping("/staffs")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping
    public List<Staff> getAllStaffs() {
        return staffService.getAllStaff();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStaff(@PathVariable Long id) {
        Staff staff = staffService.getStaffById(id);
        return staff != null ? ResponseEntity.ok(staff)
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Staff not found");
    }

    @PostMapping
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff) {
        Staff created = staffService.createStaff(staff);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        Staff updated = staffService.updateStaff(id, staff);
        return updated != null ? ResponseEntity.ok(updated)
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Staff not found");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStaff(@PathVariable Long id) {
        boolean deleted = staffService.deleteStaff(id);
        return deleted ? ResponseEntity.ok("Deleted successfully")
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Staff not found");
    }
}
