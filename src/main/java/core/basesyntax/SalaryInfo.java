package core.basesyntax;

public class SalaryInfo {
    public String getSalaryInfo(String[] names, String[] data, String dateFrom, String dateTo) {
        return new DataHandler(names, data, dateFrom, dateTo).toString();
    }
}
