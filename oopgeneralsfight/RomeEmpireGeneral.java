package oopgeneralsfight;

public class RomeEmpireGeneral extends General {

    public RomeEmpireGeneral(String name, int motivation) {
        super(name, motivation);
    }

    public RomeEmpireGeneral(String name) {
        super(name, 40);
    }

    @Override
    public void punch(General general) {
        if (general instanceof RomeEmpireGeneral) {
            return;
        }
        if (super.getMotivation() < 1) {
            return;
        }
        general.bePunched((int) Math.ceil(super.getMotivation() / 1.5));
    }
}
