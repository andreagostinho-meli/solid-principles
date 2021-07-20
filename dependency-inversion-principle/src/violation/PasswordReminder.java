package violation;

public class PasswordReminder {

    private PostgresConnection postgresConnection;

    public PasswordReminder(PostgresConnection postgresConnection) {
        this.postgresConnection = postgresConnection;
    }

}
