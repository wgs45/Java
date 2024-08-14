public class Team {
    Member member;
    public Team(Member member) {
        this.member = member;
    }

    // main method 
    public static void main(String[] args) {
        Member my_member = new Member("Alpha", "light", 10, 1);

        Team my_team = new Team(my_member);
        System.out.println(my_team.member.getName());
        System.out.println(my_team.member.getType());
        System.out.println(my_team.member.getLevel());
        System.out.println(my_team.member.getRank());
    }
}

class Member {
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getLevel() {
        return this.level;
    }

    public int getRank() {
        return this.rank;
    }
}
