using System;
using CBingo;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        Panel panel = new Panel(vbox1);
        Bombo bombo = new Bombo();
        BJugar.Clicked += delegate {

            int numero = bombo.sacarBola();
            panel.Marcar(numero);
        };

    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

  /*  protected void OnBJugarClicked(object sender, EventArgs e)
    {
        int numero = Bombo.sacarBola();
        Panel.Marcar(numero);
    }*/
}
