package truc;

public class FournisseurDeQuestion {

	private Question q;

	public void setQuestion(Question question) {
		this.q = question;
	}

	public void poseQuestion() {
		System.out.println(q.popQuestion());
	}

}
