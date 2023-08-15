import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Chapter10 {
    public static void main(String[] args) throws Exception {
        List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "�����𔃂�", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "�����Жʐ�", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "�蒠�𔃂�", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "�U���ɍs��", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "�X�N�[���̉ۑ������", false));

        long count =list.stream()
        .filter(t -> t.isDone() == false)
        .count();
        System.out.println("�������̃^�X�N�̌���"+count);
        System.out.println("�y�������̃^�X�N�������ɕ��ёւ��Ĉꗗ�\���z");

        list.stream()
        .filter(t -> t.isDone() == false)
        .sorted((t1,t2)-> t1.compareTo(t2))
        .forEach(System.out::println);

    }
	}

