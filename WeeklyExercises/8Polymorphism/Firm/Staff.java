public class Staff
{
    private final StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff ()
    {
        staffList = new StaffMember[6];

        staffList[0] = new Executive("Tony", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);

        staffList[1] = new Employee("Paulie", "456 Off Line",
                "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Vito", "789 Off Rocker",
                "555-0000", "010-20-3040", 1169.23);

        staffList[3] = new Hourly("Michael", "678 Fifth Ave.",
                "555-0690", "958-47-3625", 10.55);

        staffList[4] = new Volunteer("Adrianna", "987 Babe Blvd.",
                "555-8374");
        staffList[5] = new Volunteer("Benny", "321 Dud Lane",
                "555-7282");

        ((Executive)staffList[0]).awardBonus(500.00);

        ((Hourly)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Gives vacation to all employees based on their classification/role.
    //-----------------------------------------------------------------
    public void giveVacation()
    {
        for (StaffMember member : staffList)
        {
            if (member instanceof Executive)
            {
                ((Executive) member).giveVacation(14); // Executive gets 14 vacation days
            }
            else if (member instanceof Employee)
            {
                ((Employee) member).giveVacation(10); // Employee gets 10 vacation days
            }
            else if (member instanceof Hourly)
            {
                ((Hourly) member).giveVacation(7); // Hourly gets 7 vacation days
            }
            else if (member instanceof Volunteer)
            {
                ((Volunteer) member).giveVacation(3); // Volunteer gets 3 vacation days
            }
        }
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday()
    {
        double amount;

        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember);

            amount = staffMember.pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}