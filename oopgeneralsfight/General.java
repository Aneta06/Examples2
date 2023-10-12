package oopgeneralsfight;

public abstract class General {

    private String name;

    private int motivation;

    public General(String name, int motivation) {
        if (motivation < 0) {
            throw new RuntimeException("Please input positive number!");
        }
        this.name = name;
        this.motivation = motivation;
    }

    public int getMotivation() {
        return this.motivation;
    }

    public int getMotivationLevel() {
        if (this.motivation <= 25) {
            return 0;
        } else if (this.motivation < 40) {
            return 1;
        } else {
            return 2;
        }
    }

    public void bePunched(int damage) {
        if (this.motivation <= 0) {
            return;
        }
        this.motivation -= (int) Math.ceil((double) damage / ((double) this.motivation / 2));
    }

    public void punch(General general) {
        if (this.motivation < 1) {
            return;
        }
        general.bePunched((int) Math.ceil(this.motivation / 1.5));
    }

    @Override
    public String toString() {
        if (this.getMotivationLevel() == 0) {
            return this.name + " is not motivated anymore.";
        } else if (this.getMotivationLevel() == 1) {
            return this.name + " is motivated.";
        } else if (this.getMotivationLevel() == 2) {
            return this.name + " is well motivated.";
        } else {
            return null;
        }
    }
}

