﻿using Gtk;
using CBingo;
using System.Collections.Generic;
using System;

namespace CBingo
{
    public class Bombo
    {
        private IList<int> bolas = new List<int>();
        private Random random = new Random();

        public Bombo()
        {
            for (int bola = 1; bola <= 90; bola++)
            {
                bolas.Add(bola);
            }

        }

        public int SacarBola()
        {
            int indexAleatorio = random.Next(bolas.Count);
            int bola = bolas[indexAleatorio];
            bolas.Remove(indexAleatorio);
            return bola;
        }
    }
}