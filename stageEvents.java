public class stageEvents extends Event {
    private Integer noOfShows;
    private Double costPerShow;
    public stageEvents(String name,String detail,String type,String organiser,Integer noOfShows,Double costPerShow)
    {
        super(name,detail,type,organiser);
        this.noOfShows=noOfShows;
        this.costPerShow=costPerShow;
    }

    @Override
    Double calculateAmount() {
       return noOfShows*costPerShow;
    }
    public void display()
    {
        System.out.println("Stage Event Details");
        System.out.println("Event Name:"+name+"\n Detail:"+detail+"\nType:"+type+"\nOrganiser Name:"+organiser);
    }
}
