
public enum PasteType {
    NORMAL("normal"),GLUTEN_FREE("gluten free"),KAMUT("kamut");

    private String myType;

    private PasteType(String myType){
        this.myType = myType;
    }

    public String toString(){
        return myType;
    }


}
