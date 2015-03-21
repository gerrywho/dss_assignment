<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:con="www.conygre.com/v1/outline">
	<xsl:variable name="chapters" select="/con:course/con:contents/con:chapter"/>
	<xsl:template match="con:course">
		<p align="right">
			<a  href="/training/print.jsp?code={@code}" target="_new">Print this course</a>
		</p>
		<h1>
			<xsl:value-of select="con:title"/>
		</h1>
		<p>
			<xsl:value-of select="con:outline"/>
		</p>
		<h2>Course Duration</h2>
		<p><xsl:value-of select="con:duration"/> days</p>
			
			<h2>Layout</h2>
		<p><xsl:value-of select="con:layout"/></p>
		<h2>Who it is for</h2>
		<p><xsl:value-of select="con:who"/></p>
		<h2>Prerequisites</h2>
		<ul>
			<xsl:for-each select="con:prerequisites/con:prereq">
				<li>
					<xsl:value-of select="."/>
				</li>
			</xsl:for-each>
		</ul>
		<h2>Objectives</h2>
			<p>At the end of this course, students should be able to:</p>
			<ul>
			<xsl:for-each select="con:objectives/con:objective">
				<li>
					<xsl:value-of select="."/>
				</li>
			</xsl:for-each>
		</ul>
		<xsl:apply-templates select="con:contents"/>
	</xsl:template>
	<xsl:template match="con:contents">
		<h2>Course Contents</h2>
		<table cellpadding="5" border="0" width="600">
			<tr>
				<td valign="top">
					<xsl:apply-templates select="con:chapter[position()&lt;=(count($chapters) div 2)]"/>
				</td>
				<td valign="top">
					<xsl:apply-templates select="con:chapter[position()&gt;(count($chapters) div 2)]">
						<!-- had to use this rather cumbersome parameter passing to number the elements, since the number function did not
					work with Xalan, although it did with the XSLT engine in XML Spy -->
						<xsl:with-param name="startNumber" select="floor(count($chapters) div 2)"/>
					</xsl:apply-templates>
				</td>
			</tr>
		</table>
	</xsl:template>
	<xsl:template match="con:chapter">
		<xsl:param name="startNumber" select="0"/>
		<b>
			<xsl:value-of select="position()+$startNumber"/>. <xsl:value-of select="con:title"/>
		</b>
		<ul>
			<xsl:for-each select="con:objective">
				<li>
					<xsl:value-of select="."/>
				</li>
			</xsl:for-each>
		</ul>
	</xsl:template>
</xsl:stylesheet>
