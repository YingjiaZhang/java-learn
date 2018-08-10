public class Son {
    class FatherSon extends Father {
    }

    class MotherSon extends Mother {
    }

    public void father(){
        new FatherSon().output();
    }

    public void mother(){
        new MotherSon().output();
    }
}


