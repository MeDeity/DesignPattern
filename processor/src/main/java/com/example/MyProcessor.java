package com.example;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;

/**
 * 1.继承 AbstractProcessor
 */

//@SupportedSourceVersion(SourceVersion.RELEASE_6)  1
//@SupportedAnnotationTypes("com.example.HumanMessageAnnotation") 2

public class MyProcessor extends AbstractProcessor{

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    /**
     * {@inheritDoc}
     *
     * @param annotations
     * @param roundEnv
     * @return true
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//        for (Element element : roundEnv.getElementsAnnotatedWith(HumanMessageAnnotation.class)) {
//            if (ElementKind.METHOD == element.getKind()){
//                TypeElement typeElement = (TypeElement) element;
//                System.out.println(typeElement.getAnnotation(HumanMessageAnnotation.class).userName()+"\n"+
//                        typeElement.getAnnotation(HumanMessageAnnotation.class).getMyBrithday()+"\n"+
//                        typeElement.getAnnotation(HumanMessageAnnotation.class).getMyAge());
//            }
//        }
//        return false;
        for (Element element : roundEnv.getElementsAnnotatedWith(MyAnnotation.class)) {
            System.out.println("------------------------------");
            if (element.getKind() == ElementKind.CLASS) {
                TypeElement typeElement = (TypeElement) element;
                System.out.println(typeElement.getSimpleName());
                System.out.println(typeElement.getAnnotation(MyAnnotation.class).value());
            }
            System.out.println("------------------------------");
        }
        return false;
    }


    @Override
    public Set<String> getSupportedAnnotationTypes() {
//        Set<String> annotations = new LinkedHashSet<>();
//        annotations.add(HumanMessageAnnotation.class.getCanonicalName());//基础类的规范名称
//        return annotations;

        Set<String> annotataions = new LinkedHashSet<String>();
        annotataions.add(MyAnnotation.class.getCanonicalName());
        return annotataions;
    }


    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
}
