interface Swimmable{
    public void swim();
    public void stopSwimming();
}


interface Flyable{
    public void fly();
    public void stopFlying();
}


interface Living{
    default void live(){
        System.out.println(className, "is living");
    }
}


class Penguin implements Swimmable, Living{
    String className = "Penguin"

    @Override
    public void swim(){}

    @Override
    public void stopSwimming(){}
}
