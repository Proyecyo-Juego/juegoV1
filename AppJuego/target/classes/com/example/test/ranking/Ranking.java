package com.example.test.ranking;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Ranking {

    private Collection<Equipo> ranking= new Colection<Equipo>();

    public void CrearRanking(){
    // TODO Auto-generated method stub

        String nombre_archivo = "ranking";
        ArrayList key = new ArrayList();
        ArrayList<Equipo> todosequipos = new ArrayList<Equipo>();

        DatosGenerales DG = new DatosGenerales();
        Equipo eq1 = new Equipo();


        eq1.setNombre();
        eq1.setVictorias();


        key.add("Ranking general");

        key.add("Equipo");
        value.addAll((Collection<? extends Equipo>) eq1);


        try {
            generate(nombre_archivo, key, value);
        } catch (Exception e) {}
    }

    public static void generate(String name, ArrayList<String> key,ArrayList<Equipo> value) throws Exception{

        if(key.isEmpty() || value.isEmpty() || key.size()!=value.size()){
            System.out.println("ERROR empty ArrayList");
            return;
        }else{

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, name, null);
            document.setXmlVersion("1.0");

            //Main Node
            Element raiz = document.getDocumentElement();
            //Por cada key creamos un item que contendrá la key y el value

            for (Equipo equipo : value) {
                //Item Node
                Element itemNode = document.createElement("EQUIPO");

                //Key Node
                Element keyNode = document.createElement("KEY");
                Text nodeKeyValue = document.createTextNode(key.get(0));
                keyNode.appendChild(nodeKeyValue);

                //Value Node
                Element valueNode = document.createElement("VALUE");
                Text nodeValueValue = document.createTextNode(value.get(arg));
                valueNode.appendChild(nodeValueValue);

                //append keyNode and valueNode to itemNode
                itemNode.appendChild(keyNode);
                itemNode.appendChild(valueNode);
                //append itemNode to raiz
                raiz.appendChild(itemNode); //pegamos el elemento a la raiz "Documento"
            }
            //Generate XML
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File(name+".xml")); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        }
    }

}
    }

}