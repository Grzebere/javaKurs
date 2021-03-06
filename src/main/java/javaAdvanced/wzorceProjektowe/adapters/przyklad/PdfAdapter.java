package javaAdvanced.wzorceProjektowe.adapters.przyklad;

public class PdfAdapter implements TextEditor {
    private PdfEditor pdfEditor;
    public PdfAdapter(PdfEditor pdfEditor) {
        this.pdfEditor = pdfEditor;
    }
    @Override
    public String getText() {
        return pdfEditor.getText().replace("Text w formacie pdf: ", "");
    }
}
