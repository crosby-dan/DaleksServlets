import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Skaro", urlPatterns={"/Servlet"})
public class Skaro extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String s = "<html><head></head><body><frameset>"; // s variable will be the HTML output.
        String t = "";  // t variable will be the narrative for the battle setup
        String r = "";  // r variable will be the battle's results

        //Determine which Dalek squadron to use.
        String d1=request.getParameter("d1");
        String d2=request.getParameter("d2");
        String d3=request.getParameter("d3");
        //Determine the attack target
        String myTarget = request.getParameter("myTarget");

        if (d1!=null) {
            s=s + "<img src='img/daleksec.jpg' height='100px' width='100px'>";
            t=t + "<p>Fighting a battle with Dalek Sec";
        }
        else if (d2!=null) {
            s=s + "<img src='img/dalekwarriors.jpg' height='100px' width='100px'>";
            t=t + "<p>Fighting a battle with Dalek Warriors";
        }
        else if (d3!=null) {
            s=s + "<img src='img/supremecouncil.jpg' height='100px' width='100px'>";
            t=t + "<p>Fighting a battle with the Dalek Supreme Council";
        }

        //Add the image of the vs.
        s=s + "<img src='img/vs.jpg' height='100px' width='100px'>";

        //These lines for debugging only
        //s=s+"<p>myTarget=" + myTarget + "</p>";
        //s=s+"<p>Attack Destination : " + myTarget + "</p>";

        if (myTarget.equals("1")) {
            s=s + "<img src='img/dallas.jpg' height='100px' width='100px'>";
            t=t + " against the city of Dallas!</p>";
            r="<H4>It's a lucky day in Dallas, Dr. Who arrived in his Tardis and foiled the Dalek's.</H4>";
            r=r + "<img src='img/tardis.png' height='100px' width='100px'>";
        }
        else if (myTarget.equals("2")) {
            s=s + "<img src='img/moon.jpg' height='100px' width='100px'>";
            t=t + " against the city of Dallas!</p>";
            r="<H4>On finding the moon uninhabited, the Daleks became angry and destroyed the moon</H4>";
            r=r + "<img src='img/moondestroyed.jpg' height='100px' width='100px'>";
        }
        else if (myTarget.equals("3")) {
            s=s + "<img src='img/byuidaho.jpg' height='100px' width='100px'>";
            t=t + " against BYU Idaho!</p>";
            r="<H4>The Dalek's tried to use their ray gun, but the faith of BYU Idaho students was unstoppable.</H4>";
            r=r + "<img src='img/faith.jpg' height='100px' width='100px'>";
        }

        s=s+t + "<h2>Battle Results:</h2>" + r +"</frameset></body></html>";
        out.println(s);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("This resources can only be called via form post to the Skaro servlet.");
    }
}
