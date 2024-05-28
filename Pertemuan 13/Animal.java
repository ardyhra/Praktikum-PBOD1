public abstract class Animal {
    public abstract void eat();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
