package assignment2.controlCoupling;

public class ControlCoupling {
    public boolean flag;

    public class Kick{
        public void kickBall()
        {
            if(flag=true)
            {
                System.out.println("Kick the ball");
            }
            else
                System.out.println("Don't kick the ball");

        }

    }
}

// Using a flag value, the ControlCoupling Class is controlling the flow of kickBall() function of Kick Class.
// Therefore, Control Coupling exists between them.


