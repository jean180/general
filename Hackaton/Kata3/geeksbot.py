from telegram.ext import Updater, CommandHandler

def main():
    # Instanciamos el updater
    updater = Updater(token=open(1267593668:AAEHOqAdV09Tt6wVx2lDNu9M0XFLbhOJwb4).read(), use_context=True)

    # Añadimos un manejador al comando /start
    updater.dispatcher.add_handler(CommandHandler("start", start))

    # Añadir manejador apra el comando /repite
    updater.dispatcher.add_handler(CommandHandler("repite", repite))

    # Añadir manejador para comando /suma     
    updater.dispatcher.add_handler(CommandHandler("suma", suma))


    #Empecemos a pedir notificaciones a Telegram
    updater.start_polling()

    #Capturamos señales de parada
    updater.idle()

def start(update, context):
    update.message.reply_text("Hola soy un bot")

def repite(update, context):
    update.message.reply_text(update.message.text)
    
def suma(update, context):
    resultado = context.args[0] + context.args[1]
    update.message.reply_text("El resultado es " + resultado)

main()