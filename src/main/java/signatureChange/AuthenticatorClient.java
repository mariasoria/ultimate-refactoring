package signatureChange;

public class AuthenticatorClient {
    private AuthenticationService authenticationService;

    public static void main(String[] args) {
        new AuthenticatorClient(new AuthenticationService()).run();
    }

    public AuthenticatorClient(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public void run() {
        boolean authenticated = authenticationService.isAuthenticated(new Id(33));
        System.out.println("33 is authenticated = " + authenticated);
    }
}
