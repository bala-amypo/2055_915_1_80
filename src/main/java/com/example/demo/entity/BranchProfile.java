@Entity
public class BranchProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String branchCode;

    private String branchName;
    private String contactEmail;
    private Boolean active;
    private LocalDateTime lastSyncAt;

    @PrePersist
    public void onCreate() {
        lastSyncAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public String getBranchCode() { return branchCode; }
    public void setActive(Boolean active) { this.active = active; }
}
