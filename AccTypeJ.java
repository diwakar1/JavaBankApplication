
public enum AccTypeJ {
    Checking("Checking"), Savings("Savings");
    
    private String name;
    
    AccTypeJ(String name){
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    public static AccTypeJ fromString(String name){
        if(name != null){
            for(AccTypeJ a: AccTypeJ.values()){
                if(name.equalsIgnoreCase(a.name)){
                    return a;
                }
            }
        }
        return null;
    }
    
}
