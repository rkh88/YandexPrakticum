package Grades;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    private static String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
			String[] gradesArray = grades.split(";");
        for (String info : gradesArray) {
            String[] personArray = info.split(",");
            System.out.println(capitalize(personArray[0]) + " " + capitalize(personArray[1]) + " " + personArray[2].toLowerCase() + " - " + gradeToString(personArray[3]));
        }
    }

    public static String serializeGrades(String[] grades) {
        String finalString = "";
        String[] str = new String[grades.length];
        int i = 0;
        for (String line : grades) {
            String[] infoArray = line.split(" ");
            String nameString = String.join(",", infoArray[0].toLowerCase(), infoArray[1].toLowerCase(), infoArray[2].toLowerCase(), gradeStringToInt(infoArray[4]));
            str[i] = nameString;
            i++;
        }
        return finalString.join(";", str);
    }

    public static void main(String[] args) {
        String[] str = {"Вероника Чехова физика — Безупречно", "Анна Строкова математика — Потрясающе", "Иван Петров геометрия — Безупречно"};
        for (String line : str) {
            System.out.println(line);
        }
        System.out.println(serializeGrades(str));
    }


}
