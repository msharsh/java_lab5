package user;

import lombok.Getter;

@Getter
public class Receiver implements User{
    private final int id;
    private String status;

    public Receiver() {
        id = IdCounter.getId();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
