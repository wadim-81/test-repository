import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        1. Создать репозиторий (можно хоть пустой)
//        2. Открыть настройки репозитория и выдать права на этот репозиторий вашему преподавателю (Daniil1380)
//        3. Скачать проект (заново) из гитхаба и работать уже в нем
//        4. Создать новую ветку
//        5. Внести в код какое-то изменение и создать pull request, выполнить его
//
//        6. Создать две ветки
//        7. в ОБОИХ ветках внести изменения
//        8. Выполнить pull request на одной ветке
//        9. Решить конфликт на второй ветке
//        10. Выполнить pull request на второй ветке


        Optional <String> name =
                Optional.of("John");
        System.out.println(name.orElse("Default"));

        Optional<String>secondName =
                Optional.empty();
        System.out.println(secondName.orElse("Default"));
    }
}
