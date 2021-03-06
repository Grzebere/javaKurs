package javaAdvanced.wzorceProjektowe.adapters.przyklad;

public class ExcelAdapter implements TextEditor{
    private ExcelEditor excelEditor;
    public ExcelAdapter(ExcelEditor excelEditor) {
        this.excelEditor = excelEditor;
    }
    @Override
    public String getText() {
        return excelEditor.getText().replace("Text w formacie xml: ", "");
    }
}
