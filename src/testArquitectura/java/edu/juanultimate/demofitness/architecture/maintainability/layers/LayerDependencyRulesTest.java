package edu.juanultimate.demofitness.architecture.maintainability.layers;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "edu.juanultimate.demofitness")
public class LayerDependencyRulesTest {

    @ArchTest
    public static final ArchRule services_no_deben_acceder_controllers =
            noClasses().that().resideInAPackage("..service..")
                    .should().accessClassesThat().resideInAPackage("..controller..");

    @ArchTest
    public static final ArchRule dao_no_deben_acceder_services =
            noClasses().that().resideInAPackage("..dao..")
                    .should().accessClassesThat().resideInAPackage("..service..");

    @ArchTest
    public static final ArchRule services_should_only_be_accessed_by_controllers_or_other_services =
            classes().that().resideInAPackage("..service..")
                    .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..");

}
