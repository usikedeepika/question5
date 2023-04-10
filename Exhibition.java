public class Exhibition extends Event {
    private Integer noOfStalls;
    private Double rentPerStall;
    public Exhibition(String name,String detail,String type,String organiser,Integer noOfStalls,Double rentPerStall)
    {
        super(name,detail,type,organiser);
        this.noOfStalls=noOfStalls;
        this.rentPerStall=rentPerStall;
    }
    Double calculateAmount()
    {
        return noOfStalls*rentPerStall;
    }
    public void display()
    {
        System.out.println("Exhibition Details");
        System.out.println("Event Name:"+name+"\n Detail:"+detail+"\nType:"+type+"\nOrganiser Name:"+organiser);
    }
}
