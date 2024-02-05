public class College 
{
    String name;
    int rank;
    String city;
    
    public College(String name, int rank, String city) 
    {
        this.name = name;
        this.rank = rank;
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}