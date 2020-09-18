package signatureChange;

public class AuthenticationService {
    public boolean isAuthenticated(Id id1) {
        return id1.isAdmin();
    }
}
