package ex39;

 class Employee  {

    private final String firstN;
    private final String lastN;
    private final String position;
    private final String separationDate;

    public Employee(String firstN, String lastN, String position, String separationDate){
        this.firstN = firstN;
        this.lastN = lastN;
        this.position = position;
        this.separationDate = separationDate;
    }
    public String getFirstName() {
        return firstN;
    }

    public String getLastName() {
        return lastN;

    }

    public String getPosition() {
        return position;
    }

     public String toString(){
        return getClass().getSimpleName() + "" + firstN + ", " + lastN + ", " + position + ", " + separationDate + "";
    }



}
