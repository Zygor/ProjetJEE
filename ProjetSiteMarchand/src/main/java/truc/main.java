package truc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("MesBeansAMOI.xml");
	// FournisseurDeQuestion serviceQuestion = (FournisseurDeQuestion)
	// context.getBean("titi");
	// serviceQuestion.poseQuestion();

	ServiceLogin s = (ServiceLogin) context.getBean("servicelogin");
	s.affiche();
    }
}
