
// This file has been generated by the GUI designer. Do not modify.

public partial class MainWindow
{
	private global::Gtk.VBox vbox1;

	private global::Gtk.Label label1;

	private global::Gtk.Entry Pantalla;

	private global::Gtk.HBox hbox3;

	private global::Gtk.Button BVaciar;

	private global::Gtk.Button BBorrar;

	private global::Gtk.HBox hbox4;

	private global::Gtk.Button B7;

	private global::Gtk.Button B8;

	private global::Gtk.Button B9;

	private global::Gtk.Button BDividir;

	private global::Gtk.HBox hbox5;

	private global::Gtk.Button B4;

	private global::Gtk.Button B5;

	private global::Gtk.Button B6;

	private global::Gtk.Button BMultiplicar;

	private global::Gtk.HBox hbox6;

	private global::Gtk.Button B1;

	private global::Gtk.Button B2;

	private global::Gtk.Button B3;

	private global::Gtk.Button BRestar;

	private global::Gtk.HBox hbox7;

	private global::Gtk.Button BPunto;

	private global::Gtk.Button BCero;

	private global::Gtk.Button BIgual;

	private global::Gtk.Button BSumar;

	protected virtual void Build()
	{
		global::Stetic.Gui.Initialize(this);
		// Widget MainWindow
		this.Name = "MainWindow";
		this.Title = global::Mono.Unix.Catalog.GetString("MainWindow");
		this.WindowPosition = ((global::Gtk.WindowPosition)(4));
		this.Resizable = false;
		// Container child MainWindow.Gtk.Container+ContainerChild
		this.vbox1 = new global::Gtk.VBox();
		this.vbox1.Name = "vbox1";
		this.vbox1.Spacing = 6;
		// Container child vbox1.Gtk.Box+BoxChild
		this.label1 = new global::Gtk.Label();
		this.label1.Name = "label1";
		this.label1.LabelProp = global::Mono.Unix.Catalog.GetString("CALCULADORA");
		this.vbox1.Add(this.label1);
		global::Gtk.Box.BoxChild w1 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.label1]));
		w1.Position = 0;
		w1.Expand = false;
		w1.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.Pantalla = new global::Gtk.Entry();
		this.Pantalla.CanFocus = true;
		this.Pantalla.Name = "Pantalla";
		this.Pantalla.IsEditable = false;
		this.Pantalla.InvisibleChar = '•';
		this.vbox1.Add(this.Pantalla);
		global::Gtk.Box.BoxChild w2 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.Pantalla]));
		w2.Position = 1;
		w2.Expand = false;
		w2.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox3 = new global::Gtk.HBox();
		this.hbox3.Name = "hbox3";
		this.hbox3.Spacing = 6;
		// Container child hbox3.Gtk.Box+BoxChild
		this.BVaciar = new global::Gtk.Button();
		this.BVaciar.WidthRequest = 192;
		this.BVaciar.HeightRequest = 50;
		this.BVaciar.CanFocus = true;
		this.BVaciar.Name = "BVaciar";
		this.BVaciar.UseUnderline = true;
		this.BVaciar.Label = global::Mono.Unix.Catalog.GetString("Vaciar");
		this.hbox3.Add(this.BVaciar);
		global::Gtk.Box.BoxChild w3 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.BVaciar]));
		w3.Position = 0;
		w3.Expand = false;
		w3.Fill = false;
		// Container child hbox3.Gtk.Box+BoxChild
		this.BBorrar = new global::Gtk.Button();
		this.BBorrar.WidthRequest = 60;
		this.BBorrar.CanFocus = true;
		this.BBorrar.Name = "BBorrar";
		this.BBorrar.UseUnderline = true;
		this.BBorrar.Label = global::Mono.Unix.Catalog.GetString("Borrar");
		this.hbox3.Add(this.BBorrar);
		global::Gtk.Box.BoxChild w4 = ((global::Gtk.Box.BoxChild)(this.hbox3[this.BBorrar]));
		w4.Position = 1;
		w4.Expand = false;
		w4.Fill = false;
		this.vbox1.Add(this.hbox3);
		global::Gtk.Box.BoxChild w5 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox3]));
		w5.Position = 2;
		w5.Expand = false;
		w5.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox4 = new global::Gtk.HBox();
		this.hbox4.Name = "hbox4";
		this.hbox4.Spacing = 6;
		// Container child hbox4.Gtk.Box+BoxChild
		this.B7 = new global::Gtk.Button();
		this.B7.WidthRequest = 60;
		this.B7.HeightRequest = 60;
		this.B7.CanFocus = true;
		this.B7.Name = "B7";
		this.B7.UseUnderline = true;
		this.B7.Label = global::Mono.Unix.Catalog.GetString("7");
		this.hbox4.Add(this.B7);
		global::Gtk.Box.BoxChild w6 = ((global::Gtk.Box.BoxChild)(this.hbox4[this.B7]));
		w6.Position = 0;
		w6.Expand = false;
		w6.Fill = false;
		// Container child hbox4.Gtk.Box+BoxChild
		this.B8 = new global::Gtk.Button();
		this.B8.WidthRequest = 60;
		this.B8.CanFocus = true;
		this.B8.Name = "B8";
		this.B8.UseUnderline = true;
		this.B8.Label = global::Mono.Unix.Catalog.GetString("8");
		this.hbox4.Add(this.B8);
		global::Gtk.Box.BoxChild w7 = ((global::Gtk.Box.BoxChild)(this.hbox4[this.B8]));
		w7.Position = 1;
		w7.Expand = false;
		w7.Fill = false;
		// Container child hbox4.Gtk.Box+BoxChild
		this.B9 = new global::Gtk.Button();
		this.B9.WidthRequest = 60;
		this.B9.CanFocus = true;
		this.B9.Name = "B9";
		this.B9.UseUnderline = true;
		this.B9.Label = global::Mono.Unix.Catalog.GetString("9");
		this.hbox4.Add(this.B9);
		global::Gtk.Box.BoxChild w8 = ((global::Gtk.Box.BoxChild)(this.hbox4[this.B9]));
		w8.Position = 2;
		w8.Expand = false;
		w8.Fill = false;
		// Container child hbox4.Gtk.Box+BoxChild
		this.BDividir = new global::Gtk.Button();
		this.BDividir.WidthRequest = 60;
		this.BDividir.CanFocus = true;
		this.BDividir.Name = "BDividir";
		this.BDividir.UseUnderline = true;
		this.BDividir.Label = global::Mono.Unix.Catalog.GetString("/");
		this.hbox4.Add(this.BDividir);
		global::Gtk.Box.BoxChild w9 = ((global::Gtk.Box.BoxChild)(this.hbox4[this.BDividir]));
		w9.Position = 3;
		w9.Expand = false;
		w9.Fill = false;
		this.vbox1.Add(this.hbox4);
		global::Gtk.Box.BoxChild w10 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox4]));
		w10.Position = 3;
		w10.Expand = false;
		w10.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox5 = new global::Gtk.HBox();
		this.hbox5.Name = "hbox5";
		this.hbox5.Spacing = 6;
		// Container child hbox5.Gtk.Box+BoxChild
		this.B4 = new global::Gtk.Button();
		this.B4.WidthRequest = 60;
		this.B4.HeightRequest = 60;
		this.B4.CanFocus = true;
		this.B4.Name = "B4";
		this.B4.UseUnderline = true;
		this.B4.Label = global::Mono.Unix.Catalog.GetString("4");
		this.hbox5.Add(this.B4);
		global::Gtk.Box.BoxChild w11 = ((global::Gtk.Box.BoxChild)(this.hbox5[this.B4]));
		w11.Position = 0;
		w11.Expand = false;
		w11.Fill = false;
		// Container child hbox5.Gtk.Box+BoxChild
		this.B5 = new global::Gtk.Button();
		this.B5.WidthRequest = 60;
		this.B5.HeightRequest = 50;
		this.B5.CanFocus = true;
		this.B5.Name = "B5";
		this.B5.UseUnderline = true;
		this.B5.Label = global::Mono.Unix.Catalog.GetString("5");
		this.hbox5.Add(this.B5);
		global::Gtk.Box.BoxChild w12 = ((global::Gtk.Box.BoxChild)(this.hbox5[this.B5]));
		w12.Position = 1;
		w12.Expand = false;
		w12.Fill = false;
		// Container child hbox5.Gtk.Box+BoxChild
		this.B6 = new global::Gtk.Button();
		this.B6.WidthRequest = 60;
		this.B6.CanFocus = true;
		this.B6.Name = "B6";
		this.B6.UseUnderline = true;
		this.B6.Label = global::Mono.Unix.Catalog.GetString("6");
		this.hbox5.Add(this.B6);
		global::Gtk.Box.BoxChild w13 = ((global::Gtk.Box.BoxChild)(this.hbox5[this.B6]));
		w13.Position = 2;
		w13.Expand = false;
		w13.Fill = false;
		// Container child hbox5.Gtk.Box+BoxChild
		this.BMultiplicar = new global::Gtk.Button();
		this.BMultiplicar.WidthRequest = 60;
		this.BMultiplicar.CanFocus = true;
		this.BMultiplicar.Name = "BMultiplicar";
		this.BMultiplicar.UseUnderline = true;
		this.BMultiplicar.Label = global::Mono.Unix.Catalog.GetString("X");
		this.hbox5.Add(this.BMultiplicar);
		global::Gtk.Box.BoxChild w14 = ((global::Gtk.Box.BoxChild)(this.hbox5[this.BMultiplicar]));
		w14.Position = 3;
		w14.Expand = false;
		w14.Fill = false;
		this.vbox1.Add(this.hbox5);
		global::Gtk.Box.BoxChild w15 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox5]));
		w15.Position = 4;
		w15.Expand = false;
		w15.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox6 = new global::Gtk.HBox();
		this.hbox6.Name = "hbox6";
		this.hbox6.Spacing = 6;
		// Container child hbox6.Gtk.Box+BoxChild
		this.B1 = new global::Gtk.Button();
		this.B1.WidthRequest = 60;
		this.B1.HeightRequest = 60;
		this.B1.CanFocus = true;
		this.B1.Name = "B1";
		this.B1.UseUnderline = true;
		this.B1.Label = global::Mono.Unix.Catalog.GetString("1");
		this.hbox6.Add(this.B1);
		global::Gtk.Box.BoxChild w16 = ((global::Gtk.Box.BoxChild)(this.hbox6[this.B1]));
		w16.Position = 0;
		w16.Expand = false;
		w16.Fill = false;
		// Container child hbox6.Gtk.Box+BoxChild
		this.B2 = new global::Gtk.Button();
		this.B2.WidthRequest = 60;
		this.B2.CanFocus = true;
		this.B2.Name = "B2";
		this.B2.UseUnderline = true;
		this.B2.Label = global::Mono.Unix.Catalog.GetString("2");
		this.hbox6.Add(this.B2);
		global::Gtk.Box.BoxChild w17 = ((global::Gtk.Box.BoxChild)(this.hbox6[this.B2]));
		w17.Position = 1;
		w17.Expand = false;
		w17.Fill = false;
		// Container child hbox6.Gtk.Box+BoxChild
		this.B3 = new global::Gtk.Button();
		this.B3.WidthRequest = 60;
		this.B3.CanFocus = true;
		this.B3.Name = "B3";
		this.B3.UseUnderline = true;
		this.B3.Label = global::Mono.Unix.Catalog.GetString("3");
		this.hbox6.Add(this.B3);
		global::Gtk.Box.BoxChild w18 = ((global::Gtk.Box.BoxChild)(this.hbox6[this.B3]));
		w18.Position = 2;
		w18.Expand = false;
		w18.Fill = false;
		// Container child hbox6.Gtk.Box+BoxChild
		this.BRestar = new global::Gtk.Button();
		this.BRestar.WidthRequest = 60;
		this.BRestar.CanFocus = true;
		this.BRestar.Name = "BRestar";
		this.BRestar.UseUnderline = true;
		this.BRestar.Label = global::Mono.Unix.Catalog.GetString("-");
		this.hbox6.Add(this.BRestar);
		global::Gtk.Box.BoxChild w19 = ((global::Gtk.Box.BoxChild)(this.hbox6[this.BRestar]));
		w19.Position = 3;
		w19.Expand = false;
		w19.Fill = false;
		this.vbox1.Add(this.hbox6);
		global::Gtk.Box.BoxChild w20 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox6]));
		w20.Position = 5;
		w20.Expand = false;
		w20.Fill = false;
		// Container child vbox1.Gtk.Box+BoxChild
		this.hbox7 = new global::Gtk.HBox();
		this.hbox7.Name = "hbox7";
		this.hbox7.Spacing = 6;
		// Container child hbox7.Gtk.Box+BoxChild
		this.BPunto = new global::Gtk.Button();
		this.BPunto.WidthRequest = 60;
		this.BPunto.HeightRequest = 60;
		this.BPunto.CanFocus = true;
		this.BPunto.Name = "BPunto";
		this.BPunto.UseUnderline = true;
		this.BPunto.Label = global::Mono.Unix.Catalog.GetString(".");
		this.hbox7.Add(this.BPunto);
		global::Gtk.Box.BoxChild w21 = ((global::Gtk.Box.BoxChild)(this.hbox7[this.BPunto]));
		w21.Position = 0;
		w21.Expand = false;
		w21.Fill = false;
		// Container child hbox7.Gtk.Box+BoxChild
		this.BCero = new global::Gtk.Button();
		this.BCero.WidthRequest = 60;
		this.BCero.CanFocus = true;
		this.BCero.Name = "BCero";
		this.BCero.UseUnderline = true;
		this.BCero.Label = global::Mono.Unix.Catalog.GetString("0");
		this.hbox7.Add(this.BCero);
		global::Gtk.Box.BoxChild w22 = ((global::Gtk.Box.BoxChild)(this.hbox7[this.BCero]));
		w22.Position = 1;
		w22.Expand = false;
		w22.Fill = false;
		// Container child hbox7.Gtk.Box+BoxChild
		this.BIgual = new global::Gtk.Button();
		this.BIgual.WidthRequest = 60;
		this.BIgual.CanFocus = true;
		this.BIgual.Name = "BIgual";
		this.BIgual.UseUnderline = true;
		this.BIgual.Label = global::Mono.Unix.Catalog.GetString("=");
		this.hbox7.Add(this.BIgual);
		global::Gtk.Box.BoxChild w23 = ((global::Gtk.Box.BoxChild)(this.hbox7[this.BIgual]));
		w23.Position = 2;
		w23.Expand = false;
		w23.Fill = false;
		// Container child hbox7.Gtk.Box+BoxChild
		this.BSumar = new global::Gtk.Button();
		this.BSumar.WidthRequest = 60;
		this.BSumar.CanFocus = true;
		this.BSumar.Name = "BSumar";
		this.BSumar.UseUnderline = true;
		this.BSumar.Label = global::Mono.Unix.Catalog.GetString("+");
		this.hbox7.Add(this.BSumar);
		global::Gtk.Box.BoxChild w24 = ((global::Gtk.Box.BoxChild)(this.hbox7[this.BSumar]));
		w24.Position = 3;
		w24.Expand = false;
		w24.Fill = false;
		this.vbox1.Add(this.hbox7);
		global::Gtk.Box.BoxChild w25 = ((global::Gtk.Box.BoxChild)(this.vbox1[this.hbox7]));
		w25.Position = 6;
		w25.Expand = false;
		w25.Fill = false;
		this.Add(this.vbox1);
		if ((this.Child != null))
		{
			this.Child.ShowAll();
		}
		this.DefaultWidth = 258;
		this.DefaultHeight = 370;
		this.Show();
		this.DeleteEvent += new global::Gtk.DeleteEventHandler(this.OnDeleteEvent);
		this.BVaciar.Clicked += new global::System.EventHandler(this.OnBVaciarClicked);
		this.BBorrar.Clicked += new global::System.EventHandler(this.OnBBorrarClicked);
		this.B7.Clicked += new global::System.EventHandler(this.OnB7Clicked);
		this.B8.Clicked += new global::System.EventHandler(this.OnB8Clicked);
		this.B9.Clicked += new global::System.EventHandler(this.OnB9Clicked);
		this.BDividir.Clicked += new global::System.EventHandler(this.OnBDividirClicked);
		this.B4.Clicked += new global::System.EventHandler(this.OnB4Clicked);
		this.B5.Clicked += new global::System.EventHandler(this.OnB5Clicked);
		this.B6.Clicked += new global::System.EventHandler(this.OnB6Clicked);
		this.BMultiplicar.Clicked += new global::System.EventHandler(this.OnBMultiplicarClicked);
		this.B1.Clicked += new global::System.EventHandler(this.OnB1Clicked);
		this.B2.Clicked += new global::System.EventHandler(this.OnB2Clicked);
		this.B3.Clicked += new global::System.EventHandler(this.OnB3Clicked);
		this.BRestar.Clicked += new global::System.EventHandler(this.OnBRestarClicked);
		this.BPunto.Clicked += new global::System.EventHandler(this.OnBPuntoClicked);
		this.BCero.Clicked += new global::System.EventHandler(this.OnBCeroClicked);
		this.BIgual.Clicked += new global::System.EventHandler(this.OnBIgualClicked);
		this.BSumar.Clicked += new global::System.EventHandler(this.OnBSumarClicked);
	}
}
