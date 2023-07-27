package gullo.jose.editordetexto;
import javax.swing.*;

public class Panel extends JPanel{
    
//---------------constructor----------------------------
    public Panel(){  
        //------------Menú--------------------
        JPanel panelMenu = new JPanel();
        menu = new JMenuBar();
        archivo = new JMenu("Archivo");
        editar = new JMenu("Editar");
        ver = new JMenu("Ver");
        
        menu.add(archivo);
        menu.add(editar);
        menu.add(ver);
        
        
        //-----Elementos del menú archivo---------
        creaItem("Nueva pestaña", "archivo", "nuevo");
        creaItem("Abrir", "archivo", "abrir");
        creaItem("Guardar", "archivo", "guardar");
        creaItem("Guardar como", "archivo", "guardarComo");
        //-----------------------------------------
        //--------Elementos de menú editar--------
        creaItem("Deshacer", "editar", "");
        creaItem("Rehacer", "editar", "");
        editar.addSeparator();
        creaItem("Cortar", "editar", "");
        creaItem("Copiar", "editar", "");
        creaItem("Pegar", "editar", "");
        //-------------------------------------------
        //---------Elementos del menú ver-------------
        creaItem("Numeracion", "ver", "");        
        //-----------------------------------------
        
        
        panelMenu.add(menu);
        //------------------------------------
        
        
        
        
        //-----------area de texto------------
        tPane = new JTabbedPane();
        //------------------------------------
        
        
        
        creaPanel();
        add(panelMenu);
        add(tPane);
    }
    //------------------------------------------------------
    
    
    
    //------------------Metodo crear panel-------------------------
    public void creaPanel(){
        ventana = new JPanel();
        areaTexto = new JTextPane();       
        ventana.add(areaTexto);
        tPane.addTab("title.", ventana);
    }
    //-------------------------------------------------------------
    
    
    
    //--------------------------Metodo crear items de menu----------
    public void creaItem(String texto, String menu, String accion){
        menuItem = new JMenuItem(texto);
        if(menu.equals("archivo")){
            archivo.add(menuItem);
        }else if(menu.equals("editar")){
            editar.add(menuItem);
        }else if(menu.equals("ver")){
            ver.add(menuItem);
        }else{
            System.out.println("error.");
        }
    }
    //--------------------------------------------------------------
    
    
    
    
    private JTabbedPane tPane;
    private JPanel ventana;
    private JTextPane areaTexto;
    private JMenu archivo, editar, ver;
    private JMenuBar menu;
    private JMenuItem menuItem;
}
