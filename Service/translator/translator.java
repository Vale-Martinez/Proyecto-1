package translator;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class Translator {

    Translate translate = TranslateOptions.newBuilder().setApiKey("AIzaSyA9q4TuZNHNfc6OrZhrjc4gkFNlsiLr3jo ").build().getService();
    public String opcion;//es la variable que se toma de la lista de la interfaz 
    public String text = "This shit is working, thanks god";// se ingresa la descripcion del libro en la interfaz

    public void SelectTranslate() {
        if (opcion.equals("ingles") == true) {
            Translation translation = translate.translate(text, TranslateOption.sourceLanguage("es"), TranslateOption.targetLanguage("en"));
        }
        if (opcion.equals("frances") == true) {
            Translation translation = translate.translate(text, TranslateOption.sourceLanguage("es"), TranslateOption.targetLanguage("fr"));
        }
        if (opcion.equals("aleman")) {
            Translation translation = translate.translate(text, TranslateOption.sourceLanguage("es"), TranslateOption.targetLanguage("de"));
        }
        if (opcion.equals("portugues")) {
            Translation translation = translate.translate(text, TranslateOption.sourceLanguage("es"), TranslateOption.targetLanguage("pt"));
        }
        //System.out.println (translation.getTranslatedText());
        // se pone que en la interfaz salgo en un cuadro de texto con el .set 
    }
}
