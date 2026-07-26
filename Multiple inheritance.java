interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("Father's Method");
    }

    public void showMother() {
        System.out.println("Mother's Method");
    }

    public static void main(String[] args) {
        Child obj = new Child();

        obj.showFather();
        obj.showMother();
    }
}
