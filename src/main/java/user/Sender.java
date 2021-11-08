package user;

import lombok.Getter;

@Getter
public class Sender implements User{
    private final int id;
    private String status;

    public Sender() {
        id = IdCounter.getId();
    }

    @Override
    public void update(String status) {
        this.status = status;
    }
}
