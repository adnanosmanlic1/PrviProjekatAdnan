package eight.collection;
// T -> genericki tip uveden na nivou klase

public class Box <T>{
    private T field;

    public T getField(){
        return field;

    }
    public void setField(T field ){

        this.field = field;

    }


}
