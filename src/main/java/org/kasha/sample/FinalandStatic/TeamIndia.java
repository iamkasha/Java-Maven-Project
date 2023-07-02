package FinalandStatic;

public class TeamIndia implements IndiaTest, IndiaODI {

    @Override
    public void odi_squad() {
        System.out.println("ODI squad will be announced soon");
    }

    @Override
    public void test_squad() {
        System.out.println("Test squad will be announced soon");
    }
}
