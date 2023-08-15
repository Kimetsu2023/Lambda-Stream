import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private LocalDate date;
    private String task;
    private boolean done; // �ǉ��@������true, �������� false

	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	// boolean�^��getter���\�b�h��is�`�Ƃ��邱�Ƃ�����܂�
	public boolean isDone() {
		return done;
	}

	// compareTo���\�b�h���I�[�o�[���C�h����
	// ���t�ŕ��ёւ��邽�߁ALocalDate��compareTo���g��
	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}



	@Override
	public String toString() {
		return this.date + " " + this.task;
	}
}