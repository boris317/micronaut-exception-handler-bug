package example;

import javax.validation.constraints.NotBlank;

public class Hello {
    @NotBlank
    private String world;

    public Hello() {
        //no-arg-ctor
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
