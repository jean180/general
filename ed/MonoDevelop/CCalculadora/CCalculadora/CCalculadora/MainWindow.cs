using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    double a;
    double b;
    string c;

    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnBVaciarClicked(object sender, EventArgs e)
    {
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }

    protected void OnBBorrarClicked(object sender, EventArgs e)
    {
        Pantalla.DeleteText(Pantalla.Text.Length - 1, Pantalla.Text.Length);
    }

    protected void OnBIgualClicked(object sender, EventArgs e)
    {
        if(this.Pantalla.Text.Equals("") == false)
        {
            b = Convert.ToDouble(this.Pantalla.Text);
            switch (c)
            {
                case "":
                    break;
                case "/":
                    this.Pantalla.Text = Convert.ToString(a / b);
                    break;

                case "*":
                    this.Pantalla.Text = Convert.ToString(a * b);
                    break;

                case "-":
                    this.Pantalla.Text = Convert.ToString(a - b);
                    break;

                case "+":
                    this.Pantalla.Text = Convert.ToString(a + b);
                    break;
            }
            c = "";
        }

    }

    protected void OnBSumarClicked(object sender, EventArgs e)
    {
        a = Convert.ToDouble(this.Pantalla.Text);
        c = "+";
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }

    protected void OnBDividirClicked(object sender, EventArgs e)
    {
        a = Convert.ToDouble(this.Pantalla.Text);
        c = "/";
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }

    protected void OnBMultiplicarClicked(object sender, EventArgs e)
    {
        a = Convert.ToDouble(this.Pantalla.Text);
        c = "*";
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }

    protected void OnBRestarClicked(object sender, EventArgs e)
    {
        a = Convert.ToDouble(this.Pantalla.Text);
        c = "-";
        Pantalla.DeleteText(0, Pantalla.Text.Length);
    }

    protected void OnBPuntoClicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        if (Display.Contains(",") == false)
        {
            if (Display.Equals(""))
            {
                Pantalla.InsertText("0,");
            }
            else
            {
                Pantalla.DeleteText(0, Pantalla.Text.Length);
                Pantalla.InsertText(Display + ",");
            }
           
        }
    }

    protected void OnBCeroClicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "0");
    }

    protected void OnB1Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "1");
    }

    protected void OnB2Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "2");
    }

    protected void OnB3Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "3");
    }

    protected void OnB4Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "4");
    }

    protected void OnB5Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "5");
    }

    protected void OnB6Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "6");
    }

    protected void OnB7Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "7");
    }

    protected void OnB8Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "8");
    }

    protected void OnB9Clicked(object sender, EventArgs e)
    {
        String Display = Pantalla.Text.ToString();
        Pantalla.DeleteText(0, Pantalla.Text.Length);
        Pantalla.InsertText(Display + "9");
    }

}
