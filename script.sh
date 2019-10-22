function continuer {
	echo -e "\nContinuer ? (o/n):"
	read reponse
	if [ "$reponse" = "o" ]; then
		echo -e "on continue..."
	else
		echo -e "Operation annulee"
		exit
	fi
}
