import org.xml.sax.XMLReader;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;
public class SaxHandlerClass extends DefaultHandler
{
   public static void main(String[] args) throws Exception
   {
      System.out.println("start...");
      SaxHandlerClass saxhandler = new SaxHandlerClass();
      XMLReader readerObj = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
      readerObj.setContentHandler(saxhandler);
      readerObj.parse(args[0]);
   }
   
   public void startDocument() throws SAXException
   { 
      System.out.println("parsing start ... "); 
   }
   
   public void endDocument() throws SAXException
   { 
      System.out.println("parsing end."); 
   }
    private StringBuffer strbuff = new StringBuffer();
    private String whatElement;

    public void startElement(String uri, String localName, String fullName, Attributes atts) throws SAXException
    {
        
        System.out.println("Element is " + fullName);
      whatElement = localName;
        if (localName.equals("이름"))
        {
            strbuff.setLength(0);
        }
      for (int i=0; i<atts.getLength(); ++i)
      {
         String attsName = atts.getLocalName(i);
         String attsValue = atts.getValue(i);
         System.out.println(attsName + " : " + attsValue);
      }
    }

    public void characters(char[] chars, int start, int len)
    {
        if(whatElement.equals("이름"))
            strbuff.append(chars, start, len);

    }
   
    public void endElement(String uri, String localName, String qName)
    {
        if(localName.equals("이름"))
        {
            System.out.println("이름 is " + strbuff);
        }
    }
}