<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:param name="colour" select="string('red')"/>
	<xsl:param name="who" select="string('Toby')"/>
	<xsl:template match="/">
		<xsl:apply-templates select=".//person[@name = $who]"/>
	</xsl:template>
	<xsl:template match="person">
		<p>
			<font color="{$colour}">
		Name: <xsl:value-of select="@name"/>
				<br/>
		Age: <xsl:value-of select="@age"/>
				<ul>
					<xsl:for-each select=".//hobby">
						<li>
							<xsl:value-of select="."/>
						</li>
					</xsl:for-each>
				</ul>
			</font>
		</p>
	</xsl:template>
</xsl:stylesheet>
