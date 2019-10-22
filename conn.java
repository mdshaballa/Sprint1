/**
	 * efface les données de t38cord
	 * 
	 * @throws SQLException
	 */
	private int initT38CORD() throws SQLException {

		Connection loCnx = null;
		PreparedStatement loStatement = null;
		int loRes;
		try {
			loCnx = AbstractObject.getDBPool().getConnection();
			loStatement = loCnx.prepareStatement("delete from t38cord where no_ctr='" + coCompte + "'");
			loRes = loStatement.executeUpdate();

		} catch (SQLException loEx) {

			loRes = 0;
			throw loEx;

		} finally {
			closeStatement(loStatement);
			closeConnection(loCnx);
		}
		coRes += loRes + " ligne(s) effacée(s) de la table T8CORD\n";
		return loRes;
	} 
