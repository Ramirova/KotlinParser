import antlr4.KotlinParser;
import antlr4.KotlinParserBaseListener;

/**
 * Created by rozaliaamirova on 05/10/2018.
 */
class ClassCounterListener extends KotlinParserBaseListener {

    int numberOfClassModifier;
    int numberOfDataClass;
    int numberOfClass;


    @Override
    public void enterClassModifier(KotlinParser.ClassModifierContext ctx) {
        numberOfClassModifier++;
        if (ctx.DATA() != null) {
            numberOfDataClass++;
        }
    }

    @Override
    public void enterClassDeclaration(KotlinParser.ClassDeclarationContext ctx) {
        if (ctx.CLASS() != null) {
            numberOfClass++;
        }
    }

    /**
     * Getter for property 'numberOfClassModifier'.
     *
     * @return Value for property 'numberOfClassModifier'.
     */
    public int getNumberOfClassModifier() {
        return numberOfClassModifier;
    }

    /**
     * Getter for property 'numberOfDataClass'.
     *
     * @return Value for property 'numberOfDataClass'.
     */
    public int getNumberOfDataClass() {
        return numberOfDataClass;
    }

    /**
     * Getter for property 'numberOfClass'.
     *
     * @return Value for property 'numberOfClass'.
     */
    public int getNumberOfClass() {
        return numberOfClass;
    }
}
