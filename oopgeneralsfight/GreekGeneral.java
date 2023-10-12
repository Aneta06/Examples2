package oopgeneralsfight;

public class GreekGeneral extends General {


    public GreekGeneral(String name, int motivation) {
        super(name, motivation);
    }
    public GreekGeneral(String name){
        super(name, 45);
    }
    @Override
    public void punch(General general) {
        // kontrola jestli jestli general v parametru
        // je instanci tridy GreekGneral, tak ukonci metodu a dal se nic nedeje diky slovu return
        if (general instanceof GreekGeneral){
            return;
        }
        if (super.getMotivation() < 1) {
            return;
        }
        general.bePunched((int) Math.ceil(super.getMotivation() / 1.5));
    }
}
