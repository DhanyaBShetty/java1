class Election{
    String post;
    String candidate;
    int votes;
    public Election(String post,String candidate){
        this.post=post;
        this.candidate=candidate;
        this.votes=0;
    }
    public void advocate(){
        votes++;
    }
    public void DisplayResults(){
        System.out.println(candidate + "for" + post + "received" + votes + "votes");
    }
    
}
class Student{
    String name;
    public Student(String name){
        this.name=name;
    }
    public void vote(Election election){
        election.advocate();
        System.out.println(name + "voted for" + election.candidate + "for" + election.post);
    }
}

public class TestElection {
    public static void main(String[] args) {
       System.out.println("College elections has been announced");
       Election president=new Election("President","Anurag R Rao");
       Election vicepresident=new Election("VicPresident","Bharath Ashok Devadiga");
       Student student1=new Student("");
       Student student2=new Student("");
       System.out.println("\nVoting starts:");
       student1.vote(president);
       student1.vote(vicepresident);
       System.out.println("\nElection Results");
       president.DisplayResults();
       vicepresident.DisplayResults();
    }
    
}
