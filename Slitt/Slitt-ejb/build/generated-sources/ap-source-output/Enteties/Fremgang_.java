package Enteties;

import Enteties.Bruker;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-30T11:27:18")
@StaticMetamodel(Fremgang.class)
public class Fremgang_ { 

    public static volatile SingularAttribute<Fremgang, String> Status;
    public static volatile SingularAttribute<Fremgang, String> Oversikt;
    public static volatile SingularAttribute<Fremgang, String> Logg;
    public static volatile SingularAttribute<Fremgang, Bruker> bruker;
    public static volatile SingularAttribute<Fremgang, Long> FremgangId;

}